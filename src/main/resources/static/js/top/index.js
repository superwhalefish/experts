function login() {
	$.post("/SH/auth/login", {
		usr : $("#usr").val(),
		psw : $("#psw").val()
	}, function(data) {
		if ("SUCCESS" == data) {
			location.href = "menu";
		} else if ("NOUSR" == data) {
			$.messager.alert('提示', '用户不存在');
		}else if("LOCK"==data){
			$.messager.alert('提示', '账号已被冻结,请联系管理人员');
		} else {
			$.messager.alert('提示', '密码错误');
		}
	})
}