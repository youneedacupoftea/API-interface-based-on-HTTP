//实现当前页面展示图片
function showPic(p) {
    //得到图片链接
    var source = p.getAttribute("href");
    var placeholder = document.getElementById("placeholder");
    placeholder.setAttribute("src", source);
}
