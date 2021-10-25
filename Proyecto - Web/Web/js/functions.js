

$( document ).ready(function() {

// PRELOADER	
	setTimeout(function(){
		$('body').addClass('loaded');
	}, 2000);
	
// SCROLL REVEAL
	window.sr = new scrollReveal();
});