<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String path=request.getContextPath();
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   System.out.println(basePath);
   %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
 <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="http://localhost:8080/Ccgl/css/style.css" type="text/css" media="screen">
    <link rel="stylesheet" href="http://localhost:8080/Ccgl/css/grid.css" type="text/css" media="screen">   
    <script src="http://localhost:8080/Ccgl/js/jquery-1.10.2.min.js" type="text/javascript"></script> 
    <script src="http://localhost:8080/Ccgl/js/jquery.easing.1.3.js" type="text/javascript"></script>
    <script src="http://localhost:8080/Ccgl/js/jcarousellite_1.0.1.js" type="text/javascript"></script>
    <script src="http://localhost:8080/Ccgl/js/jquery.galleriffic.js" type="text/javascript"></script>
    <script src="http://localhost:8080/Ccgl/js/jquery.opacityrollover.js" type="text/javascript"></script> 
    <script type="text/javascript">
		$(document).ready(function() { 
			$(".jCarouselLite").jCarouselLite({
				  btnNext: ".next",
				  btnPrev: ".prev",		  
				  speed: 400,		  
				  vertical: false,
				  circular: true,
				  easing:'easeOutQuart',
				  visible: 4,
				  start: 0,
				  scroll: 1
			 });
		});
	</script>    
</head>
<body id="page3">
	<!--==============================header=================================-->
    <header>
    	<div class="row-1">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_12">
                    	<nav>
                            <ul class="menu">
                                <li><a class="active" href="/Ccgl/goindex.jsp">关于我们</a></li>
                                <!-- <li><a href="/Ccgl/pricing.jsp">价格</a></li>
                                <li><a href="/Ccgl/contacts.jsp">联系</a></li> -->
                                 <li >
                                 <a href="/Ccgl/admin.jsp" >[进入后台]</a>
                                 </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="row-2">
        	<div class="main">
            	<div class="container_12">
                	<div class="grid_9">
                    	<h1>
                            <a class="logo" href="index.html">ST<strong>O</strong>RAGE</a>
                            <span>Design</span>
                        </h1>
                    </div>
                    <div class="grid_3">
                    	<!-- <form id="search-form" method="post" enctype="multipart/form-data">
                            <fieldset>	
                                <div class="search-field">
                                    <input name="search" type="text" />
                                    <a class="search-button" href="#" onClick="document.getElementById('search-form').submit()"><span>search</span></a>	
                                </div>						
                            </fieldset>
                        </form> -->
                     </div>
                     <div class="clear"></div>
                </div>
            </div>
        </div>    	
    </header><div class="ic">More Website Templates  @ TemplateMonster.com - August22nd 2011!</div>
    
<!-- content -->
    <section id="content">
        <div class="bg-top">
        	<div class="bg-top-2">
                <div class="bg">
                    <div class="bg-top-shadow">
                        <div class="main">
                            <div class="gallery p3">
                            	<div class="wrapper indent-bot">
                                    <div id="gallery" class="content">
                                       <div class="wrapper">
                                           <div class="slideshow-container">
                                                <div id="slideshow" class="slideshow"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="thumbs" class="navigation">
                                        <ul class="thumbs noscript">
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img1.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-1.jpg" alt="" /><span></span> </a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img2.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-2.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img3.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-3.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img4.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-4.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img5.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-5.jpg" alt="" /> <span></span></a>
                                            </li> 
                                            <li>
                                                <a class="thumb" href="images/myPhone/gallery-img6.jpg" title=""> <img src="http://localhost:8080/Ccgl/images/myPhone/thumb-6.jpg" alt="" /> <span></span></a>
                                            </li>           
                                        </ul>
                                    </div>
                                </div>
                                <div class="inner-2">
                                    <div class="wrapper">
                                        <span class="title t2 img-indent3">关于我们：</span>
                                        <div class="extra-wrap indent-top2">
                                        	天津丰拓科技有限公司是一家集研发、生产、技术服务为一体的镀铬添加剂整体设备及信息镀铬的高新技术企业。公司自创立以来，秉持“诚信、品质、专业“的企业精神，不断创新不断奋斗，不断进步。公司依靠人才资源和技术优势，充分发挥科技创新能力，致力于镀铬整体设备及镀铬添加剂的开发和生产
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel">
                                <h3 class="color-1 p2">相关证件</h3>
                                <a class="prev" href="#">Prev</a>
                                <a class="next" href="#">Next</a>
                                <div class="jCarouselLite">
                                    <ul id="carousel">
                                        <li><a href="#"><img src="images/myPhone/page3-img1.jpg" alt="" /><span>营业执照</span></a></li>
                                        <li><a href="#"><img src="images/myPhone/page3-img2.jpg" alt="" /><span>税务登记</span></a></li>
                                        <li><a href="#"><img src="images/myPhone/page3-img3.jpg" alt="" /><span>营业执照</span></a></li>
                                        <li><a href="#"><img src="images/myPhone/page3-img4.jpg" alt="" /><span>税务登记</span></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>	
        </div>
       
    
	<!--==============================footer=================================-->
    <footer>
        <div class="main">
        	<div class="container_12">
            	<div class="wrapper">
                	<div class="grid_4">
                    	<div>Storage Design &copy; 2018 <a class="link color-3" href="#">ZXL</a></div>
                        
                        <!-- {%FOOTER_LINK} -->
                    </div>
                    <div class="grid_4">
                    	<span class="phone-numb"><span>185</span> 0223-3338</span>
                    </div>
                    <div class="grid_4">
                    	<ul class="list-services">
                        	<li><a href="#"></a></li>
                            <li><a class="item-2" href="#"></a></li>
                            <li><a class="item-3" href="#"></a></li>
                            <li><a class="item-4" href="#"></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script type="text/javascript">
			$(window).load(function() {
			// We only want these styles applied when javascript is enabled
			$('div.navigation').css({'width' : '320px', 'float' : 'right'});
			$('div.content').css('display', 'block');
	
			// Initially set opacity on thumbs and add
			// additional styling for hover effect on thumbs
			var onMouseOutOpacity = 0.5;
			$('#thumbs ul.thumbs li span').opacityrollover({
				mouseOutOpacity:   onMouseOutOpacity,
				mouseOverOpacity:  0.0,
				fadeSpeed:         'fast',
				exemptionSelector: '.selected'
			});
			
			// Initialize Advanced Galleriffic Gallery
			var gallery = $('#thumbs').galleriffic({
				delay:                     7000,
				numThumbs:                 12,
				preloadAhead:              6,
				enableTopPager:            false,
				enableBottomPager:         false,
				imageContainerSel:         '#slideshow',
				controlsContainerSel:      '',
				captionContainerSel:       '',
				loadingContainerSel:       '',
				renderSSControls:          true,
				renderNavControls:         true,
				playLinkText:              'Play Slideshow',
				pauseLinkText:             'Pause Slideshow',
				prevLinkText:              'Prev',
				nextLinkText:              'Next',
				nextPageLinkText:          'Next',
				prevPageLinkText:          'Prev',
				enableHistory:             true,
				autoStart:                 7000,
				syncTransitions:           true,
				defaultTransitionDuration: 900,
				onSlideChange:             function(prevIndex, nextIndex) {
					// 'this' refers to the gallery, which is an extension of $('#thumbs')
					this.find('ul.thumbs li span')
						.css({opacity:0.5})
				},
				onPageTransitionOut:       function(callback) {
					this.find('ul.thumbs li span').css({display:'block'});
				},
				onPageTransitionIn:        function() {
					this.find('ul.thumbs li span').css({display:'none'});
				}
			});
		});
	</script>
</body>
</html>