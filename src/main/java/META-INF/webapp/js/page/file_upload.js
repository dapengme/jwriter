/*global $:false, alert:false */

$(document).ready(function() {
	
	
	"use strict";
	
	// init dropzone
	var myDropzone=  $(".dropzone-box").dropzone({ 
		url: "/upload"
	});
	
	
	myDropzone.on("success", function() {
        jQuery('.success-mark').show();
        jQuery('.error-mark').hide();
	});
	myDropzone.on("error", function() {
        jQuery('.success-mark').hide();
        jQuery('.error-mark').show();
	});
});