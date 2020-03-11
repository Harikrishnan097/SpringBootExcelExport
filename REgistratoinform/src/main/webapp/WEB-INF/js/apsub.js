var application= new Array();
application['CCBAT'] = new Array('purg','auto');
application['ccser'] = new Array('serv','native');

function setSubapp()
{
	app_sel=document.getElementById('application');
	applist=application[app_sel.value];
	changeSelect('subapp',applist,applist);
}
function changeSelect(feildid,newOptions,newValues)
{
	

selectField=document.getElementById(feildid);
selectField.options.length=0;
for(i=0;i<newOptions.length;i++)
	{
	
	selectField.options[selectField.length] = new Option(newOptions[i],newValues[i]);
	}


}