$(document).ready(function($){
var pager = $('#dg').datagrid().datagrid('getPager');	// get the pager of datagrid
pager.pagination({
	buttons:[{
		iconCls:'icon-search',
		handler:function(){
			alert('search');
		}
	},{
		iconCls:'icon-add',
		handler:function(){
			alert('add');
		}
	},{
		iconCls:'icon-edit',
		handler:function(){
			alert('edit');
		}
	}]
});	

		});

var TT={
	formatDateTime:function(val,row){
		var now = new Date(val);
    	return now.format("yyyy-MM-dd hh:mm:ss");
	},
	/*动态改变性别*/
	changeGender:function(value,row){
		if(value=='1'){
			return '男';
		}else{
			return '女';
		}
		
	},
	
	changeYesOrNo:function(value,row){
		if(value=='1'){
			return '是';
		}else{
			return '否';
		}
		
	}
	
}

/*日期格式化*/
Date.prototype.format = function(format){ 
    var o =  { 
    "M+" : this.getMonth()+1, //month 
    "d+" : this.getDate(), //day 
    "h+" : this.getHours(), //hour 
    "m+" : this.getMinutes(), //minute 
    "s+" : this.getSeconds(), //second 
    "q+" : Math.floor((this.getMonth()+3)/3), //quarter 
    "S" : this.getMilliseconds() //millisecond 
    };
    if(/(y+)/.test(format)){ 
    	format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
    }
    for(var k in o)  { 
	    if(new RegExp("("+ k +")").test(format)){ 
	    	format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length)); 
	    } 
    } 
    return format; 
};