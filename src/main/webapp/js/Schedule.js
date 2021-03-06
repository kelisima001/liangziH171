$(document).ready(function() {
//[id,title,start,end，全天日程，跨日日程,循环日程,theme,'','']          
var view="week";          
﻿ __CURRENTDATA=[['6147','你好啊',new Date(1338427800000),new Date(1338431400000),0,0,1,0,1,'','']];
var op = {
	view: view,
	theme:3,
	showday: new Date(),
	EditCmdhandler:Edit,
	DeleteCmdhandler:Delete,
	ViewCmdhandler:View,    
	onWeekOrMonthToDay:wtd,
	onBeforeRequestData: cal_beforerequest,
	onAfterRequestData: cal_afterrequest,
	onRequestDataError: cal_onerror, 
	url: "calendar.php?mode=get" ,  
	quickAddUrl: "calendar.php?mode=quickadd" ,  
	quickUpdateUrl: "calendar.php?mode=quickupdate" ,  
	quickDeleteUrl:  "calendar.php?mode=quickdelete" //快速删除日程的
   /* timeFormat:" hh:mm t", //t表示上午下午标识,h 表示12小时制的小时，H表示24小时制的小时,m表示分钟
	tgtimeFormat:"ht" //同上 */             
};
var $dv = $("#calhead");
var _MH = document.documentElement.clientHeight;
var dvH = $dv.height() + 2;
op.height = _MH - dvH;
op.eventItems =__CURRENTDATA;

var p = $("#gridcontainer").bcalendar(op).BcalGetOp();
if (p && p.datestrshow) {
	$("#txtdatetimeshow").text(p.datestrshow);
}
$("#caltoolbar").noSelect();

$("#hdtxtshow").datepicker({ picker: "#txtdatetimeshow", showtarget: $("#txtdatetimeshow"),
onReturn:function(r){                          
				var p = $("#gridcontainer").BCalGoToday(r).BcalGetOp();
				if (p && p.datestrshow) {
					$("#txtdatetimeshow").text(p.datestrshow);
				}
		 } 
});
function cal_beforerequest(type)
{
	var t="正在加载数据...";
	switch(type)
	{
		case 1:
			t="正在加载数据...";
			break;
		case 2:                      
		case 3:  
		case 4:    
			t="正在处理请求...";                                   
			break;
	}
	$("#errorpannel").hide();
	$("#loadingpannel").html(t).show();    
}
function cal_afterrequest(type)
{
	switch(type)
	{
		case 1:
			$("#loadingpannel").hide();
			break;
		case 2:
		case 3:
		case 4:
			$("#loadingpannel").html("操作成功!");
			window.setTimeout(function(){ $("#loadingpannel").hide();},2000);
		break;
	}              
   
}
function cal_onerror(type,data)
{
	$("#errorpannel").show();
}
function Edit(data)
{
   var eurl="";   
	if(data)
	{
		var url = StrFormat(eurl,data);
		OpenModelWindow(url,{ width: 600, height: 400, caption:"管理日程",onclose:function(){
		   $("#gridcontainer").BCalReload();
		}});
	}
}    
function View(data)
{
	var vurl="";   
	if(data)
	{
		var url = StrFormat(vurl,data);
		OpenModelWindow(url,{ width: 600, height: 400, caption: "查看日程"});
	}                
}    
function Delete(data,callback)
{  
	$.alerts.okButton="确定";  
	$.alerts.cancelButton="取消";  
	hiConfirm("是否要删除该日程?", '确认',function(r){ r && callback(0);});           
}
function wtd(p)
{
   if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}
	$("#caltoolbar div.fcurrent").each(function() {
		$(this).removeClass("fcurrent");
	})
	$("#showdaybtn").addClass("fcurrent");
}
//显示日视图
$("#showdaybtn").click(function(e) {
	//document.location.href="#day";
	$("#caltoolbar div.fcurrent").each(function() {
		$(this).removeClass("fcurrent");
	})
	$(this).addClass("fcurrent");
	var p = $("#gridcontainer").BCalSwtichview("day").BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}
});
//显示周视图
$("#showweekbtn").click(function(e) {
	//document.location.href="#week";
	$("#caltoolbar div.fcurrent").each(function() {
		$(this).removeClass("fcurrent");
	})
	$(this).addClass("fcurrent");
	var p = $("#gridcontainer").BCalSwtichview("week").BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}

});
//显示月视图
$("#showmonthbtn").click(function(e) {
	//document.location.href="#month";
	$("#caltoolbar div.fcurrent").each(function() {
		$(this).removeClass("fcurrent");
	})
	$(this).addClass("fcurrent");
	var p = $("#gridcontainer").BCalSwtichview("month").BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}
});

$("#showreflashbtn").click(function(e){
	$("#gridcontainer").BCalReload();
});

//点击新增日程
$("#faddbtn").click(function(e) {
	var url ="";
	OpenModelWindow(url,{ width: 500, height: 400, caption: "新增日程"});
});
//点击回到今天
$("#showtodaybtn").click(function(e) {
	var p = $("#gridcontainer").BCalGoToday().BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}


});
//上一个
$("#sfprevbtn").click(function(e) {
	var p = $("#gridcontainer").BCalPrev().BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}

});
//下一个
$("#sfnextbtn").click(function(e) {
	var p = $("#gridcontainer").BCalNext().BcalGetOp();
	if (p && p.datestrshow) {
		$("#txtdatetimeshow").text(p.datestrshow);
	}
});
$("#changetochinese").click(function(e){
	location.href="?lang=zh-cn";
});
$("#changetoenglish").click(function(e){
	location.href="?lang=en-us";
});
 $("#changetoenglishau").click(function(e){
	location.href="?lang=en-au";
});

});
