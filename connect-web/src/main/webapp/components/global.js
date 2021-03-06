var settings = {
	simple : {
		toolbar: [
	              ["bold", "italic", "underline"],
	              ["p", "h1", "h2", "h3", "h4", "h5", "h6"],
	              ["link", "unlink", "|", "image"]
	          ]
	}
};

$(document).ready(function(){
	$('.ajaxAction').click(function(){
		var url = $(this).attr('href');
		$.get(url, function(data){
			window.location.reload();
		});
		return false;
	});
	//
	$('.popupAction').fancybox();
});

function showModalWindow(url, options) {
	if (window.showModalDialog) {
		window.showModalDialog(url, '', 'dialogWidth:'+options.width+';dialogHeight:'+options.height);
	} else {
		window.open(url, '', 'height='+options.width+',width='+options.height+',toolbar=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no ,modal=yes');
	}
}