var opts = {
  container: 'epiceditor',
  basePath: '/js/epiceditor',
  clientSideStorage: true,
  localStorageName: 'epiceditor',
  useNativeFullsreen: true,
  parser: marked,
  file: {
    name: 'epiceditor',
    defaultContent: '',
    autoSave: 100
  },
  theme: {
    base:'/themes/base/epiceditor.css',
    preview:'/themes/preview/github.css',
    editor:'/themes/editor/epic-light.css'
  },
  focusOnLoad: false,
  shortcut: {
    modifier: 18,
    fullscreen: 70,
    preview: 80
  }
}
var editor = new EpicEditor(opts);
editor.load();


$.ajax({
	  url: '/note/detail',
	  type: 'GET',
	  dataType: 'json',
	  success: function(detail) {
		  $("#id").val(detail.id);
		  $("#title").val(detail.title);
		  editor.importFile(detail.title, detail.content);
	  }
});

setInterval("saveNote()",10000);

function saveNote(){
	var id=$("#id").val();
	var title = $("#title").val();
	var content = editor.exportFile();
	$.ajax({
		  url: '/note/update',
		  type: 'POST',
		  dataType: 'json',
		  data: {id: id,content:content,title:title},
		  success: function(result) {
			  console.log("save ok");
		  }
	});
}


