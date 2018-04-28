function pr(_id)
{
    var select_id = parseInt(_id.replace("xx",""));
    for (i=1;i<=8;i++)
    {
    if (i==select_id)
    {
    document.getElementById("xx"+i).className = "x_css";
    }
    else
    {
    document.getElementById("xx"+i).className = "y_css";
    }
    }
    }
    
function show(num){
 document.getElementById(num).style.display="block";
}
function hidden1(num){
 document.getElementById(num).style.display="none";
}
    
function r(num){
 document.getElementById(num).style.display="block";
}
function r_1(num){
 document.getElementById(num).style.display="none";
}
   
    
    function srcchange(id)
    {
    if(id=="hr1")
    {
        document.getElementById("mainFrame").src="rsxz/Employlee.html";
        document.getElementById("dTitle").innerHTML="<img src='images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
        
    }
    else if(id=="hr2")
    {
     document.getElementById("mainFrame").src="rsxz/RecruiterApply.html";
     document.getElementById("dTitle").innerHTML="<img src='images/xingzhengManage.jpg' alt='' style='margin-top:5px'/>";
     document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr3")
    {
    document.getElementById("mainFrame").src="rsxz/ExaAppDocument.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr15")
    {
    document.getElementById("mainFrame").src="notice/NoticeClass.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr16")
    {
    document.getElementById("mainFrame").src="notice/NoticeShow.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr17")
    {
      document.getElementById("mainFrame").src="notice/Notice.html";
      document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr18")
    {
    document.getElementById("mainFrame").src="notice/NoticeCount.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr19")
    {
    document.getElementById("mainFrame").src="xtsz/XTCS.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr20")
    {
    document.getElementById("mainFrame").src="xtsz/Branch.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr21")
    {
    document.getElementById("mainFrame").src="xtsz/Role.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr22")
    {
    document.getElementById("mainFrame").src="xtsz/Power.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr23")
    {
    document.getElementById("mainFrame").src="xtsz/EaDoc.html";
    document.getElementById("dTitle").style.display="none";
    }
    
    else if(id=="hr4")
    {
        document.getElementById("mainFrame").src="knowledge/KnowLedgeClass.html";
         document.getElementById("dTitle").innerHTML="<img src='images/itemdangan' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr5")
    {
   
     document.getElementById("mainFrame").src="knowledge/KnowLedge.html";
     document.getElementById("dTitle").innerHTML="<img src='images/itemxinde.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr6")
    {
    document.getElementById("mainFrame").src="knowledge/openKnowLedge.html";
     document.getElementById("dTitle").innerHTML="<img src='images/picmanager.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr7")
    {
    
        document.getElementById("mainFrame").src="knowledge/ChangjianWenti.htm";
        document.getElementById("dTitle").innerHTML="<img src='images/question.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr8")
    {
     document.getElementById("mainFrame").src="task/Schedule.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr9")
    {
    document.getElementById("mainFrame").src="task/TaskAllot.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr10")
    {
     document.getElementById("mainFrame").src="task/TaskShow.html";
     document.getElementById("dTitle").style.display="none";
    }
     else if(id=="hr51")
    {
     document.getElementById("mainFrame").src="task/IssuedTask.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr11")
    {
    document.getElementById("mainFrame").src="task/DelayTaskApply.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr12")
    {
        document.getElementById("mainFrame").src="task/DelayTask.html";
        document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr13")
    {
     document.getElementById("mainFrame").src="task/MoveTaskApply.html";
     document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr14")
    {
    document.getElementById("mainFrame").src="task/MoveTask.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr24")
    {
    document.getElementById("mainFrame").src="client/OrderShow.html";
    document.getElementById("dTitle").innerHTML="<img src='images/orderManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
        else if(id=="hr25")
    {
    document.getElementById("mainFrame").src="customer/customerList.html";
    document.getElementById("dTitle").innerHTML="<img src='images/clientManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
        else if(id=="hr26")
    {
    document.getElementById("mainFrame").src="xtsz/NormalManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr27")
    {
    document.getElementById("mainFrame").src="xtsz/CustomManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
//        else if(id=="hr28")
//    {
//    document.getElementById("mainFrame").src="client/ClientIdea.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr29")
//    {
//    document.getElementById("mainFrame").src="#";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr30")
//    {
//    document.getElementById("mainFrame").src="client/ClientReceipt.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr31")
//    {
//    document.getElementById("mainFrame").src="client/ClientAudit.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr32")
//    {
//    document.getElementById("mainFrame").src="client/ClientManager.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//     else if(id=="hr33")
//    {
//    document.getElementById("mainFrame").src="client/ClientLog.html";
//    document.getElementById("dTitle").style.display="none";
//    }
    else if(id=="hr34")
    {
    document.getElementById("mainFrame").src="task/TaskResult.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr35")
    {
    document.getElementById("mainFrame").src="item/ItemClass.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr36")
    {
    document.getElementById("mainFrame").src="item/Item.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr37")
    {
    document.getElementById("mainFrame").src="item/ItemPact.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr38")
    {
    document.getElementById("mainFrame").src="item/TaskAllo.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr39")
    {
    document.getElementById("mainFrame").src="item/TaskProShow.html";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr40")
    {
    document.getElementById("mainFrame").src="item/TaskProRec.html";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr41")
    {
    document.getElementById("mainFrame").src="item/ItemToFile.html";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr42")
    {
    document.getElementById("mainFrame").src="item/ItemToFileAudit.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr43")
    {
    document.getElementById("mainFrame").src="product/LineManage.htm";
    document.getElementById("dTitle").style.display="none";
    }
      else if(id=="hr44")
    {
    document.getElementById("mainFrame").src="product/StyleView.htm";
    document.getElementById("dTitle").style.display="none";
    }
        else if(id=="hr45")
    {
    document.getElementById("mainFrame").src="product/SpecificationView.htm";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr46")
    {
    document.getElementById("mainFrame").src="product/productManage.html";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr47")
    {
    document.getElementById("mainFrame").src="product/ProductDetail.htm";
    document.getElementById("dTitle").style.display="none";
    }
//     else if(id=="hr48")
//    {
//    document.getElementById("mainFrame").src="product/PurchaseView.htm";
//    document.getElementById("dTitle").style.display="none";
//    }
    
      else if(id=="hr49")
    {
    document.getElementById("mainFrame").src="product/FavoritesView.htm";
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="hr50")
    {
    document.getElementById("mainFrame").src="product/ProductShowMange.htm";
    document.getElementById("dTitle").style.display="none";
    }
//    else if(id=="hr43")
//    {
//    document.getElementById("mainFrame").src="product/ProductLine.html";
//    document.getElementById("dTitle").style.display="none";
//    }
//        else if(id=="hr46")
//    {
//    document.getElementById("mainFrame").src="product/productManage.html";
//    document.getElementById("dTitle").style.display="none";
//    }
    else if(id=="hr497")//48
    {
    document.getElementById("mainFrame").src="knowledge/Peixuzhiliao.htm";
     document.getElementById("dTitle").innerHTML="<img src='images/peixunzhiliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr498")//49
    {
    document.getElementById("mainFrame").src="knowledge/OtherKnowLedge.htm";
     document.getElementById("dTitle").innerHTML="<img src='images/otherziliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr499")
    {
    document.getElementById("mainFrame").src="knowledge/gerenzhiliaolist.htm";
    document.getElementById("dTitle").innerHTML="<img src='images/gereziliao.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="hr500")
    {
    document.getElementById("mainFrame").src="knowledge/AuditKnowLedge.html";
        document.getElementById("dTitle").innerHTML="<img src='images/knowledgeshenhe.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    
    }
    function changeIcon(id)
    {
    if(id=="HR")
    {
    document.getElementById("dTitle").innerHTML="<img src='images/rensiManage.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Notice")
    {
    document.getElementById("dTitle").style.display="none";
    }
    else if(id=="KnowLedge")
    {
     document.getElementById("dTitle").innerHTML="<img src='images/itemdangan.jpg' alt='' style='margin-top:5px'/>";
        document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Task")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="Order")
    {
      document.getElementById("dTitle").innerHTML="<img src='images/orderManage.jpg' alt='' style='margin-top:5px'/>";
    document.getElementById("dTitle").style.display="block";
    }
    else if(id=="Item")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="System")
    {
    document.getElementById("dTitle").style.display="none";
    }
     else if(id=="Product")
    {
    document.getElementById("dTitle").style.display="none";
    }
    }
