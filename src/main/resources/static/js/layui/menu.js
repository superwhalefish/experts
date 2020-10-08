layui.use('element', function() {


	function checkLastItem(arr, i) {
		return arr.length == (i + 1);
	}

	function getAhtml(obj) { //下拉菜单
		return "<a href=\"javascript:;\" data-url=" + obj.url + " data-id=" + obj.id + " data-title=" + obj.name + ">" +
			obj.name + "</a>";

	}
	//动态菜单
	layui.jquery.ajax({
		url: "json/men.json",//路径
		method: "get",
		dataType: "json",
		success: function(res) {
			alert(res[2].tHm);
			var html = "";
			for (var i = 0; i < res.length; i++) {
				var strli = "<li shiro:hasPermission=\"111111111\" class=\"layui-nav-item lay-unselect \" >";
				if (res[i].url == '#') {
					strli = strli + "<a href=\"javascript:;\">" + res[i].name + "</a>";
					console.log(res[i].name);
				} else {
					strli = strli + getAhtml(res[i]);
				}
				if (res[i].pid == "0" && !checkLastItem(res, i) && res[i + 1].pid != "0") {
					strli = strli + "<dl class=\"layui-nav-child\" >";
					for (; !checkLastItem(res, i) && res[i + 1].pid != "0"; i++) {
						strli = strli + "<dd>" + getAhtml(res[i + 1]) + "</dd>";
					}
					strli = strli + "</dl>";
				}
				strli = strli + "</li>";
				html = html + strli;
			}
			layui.jquery("#memus").html(html); //导航条的id
			layui.element.init(); //初始化
		}
	})
});
//添加选项卡

