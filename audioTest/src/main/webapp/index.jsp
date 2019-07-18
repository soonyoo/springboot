<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="#" id="changehead" class="dropdown-item">
                        <i class="fa fa-user"></i> 转语音
        <input type="file" id="choose_img" name="file" style="margin-left:1px"
					multiple="multiple" />
					
                    </a>
      <button type="录音" id="record_btn" class="btn btn-primary">录音</button>
      <button type="暂停" id="stop_btn" class="btn btn-primary">暂停</button>
      <button type="下载" id="download_btn" class="btn btn-primary">下载</button>
   <button type="转换" id="change_btn" class="btn btn-primary">转换</button>
  <script src="./vendor/recorder/recorder.js"></script>
  <script src="./vendor/jquery/jquery.min.js"></script>
<script>


let recorder = new Recorder({
    numChannels:1,
    sampleRate:16000
});
$("#record_btn").click(function() {
	recorder.start();
})
$("#stop_btn").click(function() {
	recorder.pause();
})
$("#download_btn").click(function() {
	recorder.downloadPCM();
	//recorder.downloadWAV();
})
$("#change_btn").click(function() {
	window.location.href = "/ChangeToChinese";
})
document.getElementById("changehead").onclick=function changeh(){
		var file2 = document.getElementById('choose_img').files;
		var form = new FormData();
		if(file2.length==1){
			form.append("file", file2[0]);
		
		$.ajax({
			url : "http://localhost:8080/ChangeToChinese",
			dataType : "json",
			data : form,
			processData : false,
			contentType : false,
			type : "POST",
			async:false,
			success : function() {
				window.location.reload();
			},
		});
		}else{
			alert("图片数目错误");
		}
		window.location.reload();
						}
						
		
	
 </script>
</body>
</html>