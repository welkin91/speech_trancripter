if (window.console) {
  	console.log("Welcome to your Play application's JavaScript!");
}

$(document).ready(function () {
	$('.context.example .ui.sidebar')
		.sidebar({context: $('.context.example .bottom.segment')})
		.sidebar('attach events', '.context.example .menu .item');

	// $('#show_div').hide();
	// $('#upload_div').hide();

	$('#upload_button').on('click', function(){
		$('#upload_div').show();
		$('#show_div').hide();
	});

	$('#show_button').on('click', function(){
		$('#show_div').show();
		$('#upload_div').hide();
	});

	$("input:text").click(function() {
	  $(this).parent().find("input:file").click();
	});

	$('input:file', '.ui.action.input')
	  .on('change', function(e) {
	    var name = e.target.files[0].name;
	    $('input:text', $(e.target).parent()).val(name);
	  });
    //
    // $('.upload').on('click', function () {
		// console.log("this is it");
    // });

	// $('#upload_submit').on('click', function(){
	// 	console.log('here');
	// });

    var fileExtentionRange = '.zip .rar .tar .pdf .doc .docx .xls .xlsx .ppt .pptx';
    var MAX_SIZE = 30; // MB

    $(document).on('change', '.btn-file :file', function() {
        var input = $(this);

        if (navigator.appVersion.indexOf("MSIE") != -1) { // IE
            var label = input.val();

            input.trigger('fileselect', [ 1, label, 0 ]);
        } else {
            var label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
            var numFiles = input.get(0).files ? input.get(0).files.length : 1;
            var size = input.get(0).files[0].size;

            input.trigger('fileselect', [ numFiles, label, size ]);
        }
    });

    $('.btn-file :file').on('fileselect', function(event, numFiles, label, size) {
        $('#attachmentName').attr('name', 'attachmentName'); // allow upload.

        var postfix = label.substr(label.lastIndexOf('.'));
        if (fileExtentionRange.indexOf(postfix.toLowerCase()) > -1) {
            if (size > 1024 * 1024 * MAX_SIZE ) {
                alert('max size：<strong>' + MAX_SIZE + '</strong> MB.');

                $('#attachmentName').removeAttr('name'); // cancel upload file.
            } else {
                var x = $('#_attachmentName').val(label);
                console.log(x);
            }
        } else {
            alert('file type：<br/> <strong>' + fileExtentionRange + '</strong>');

            $('#attachmentName').removeAttr('name'); // cancel upload file.
        }
    });
});


