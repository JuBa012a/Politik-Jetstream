function toggleLightDark() {
  $('.content').toggleClass('dark-mode');
  $('.toggledarkbutton').toggleClass('dark-mode toggledarkbutton-dark');
  $('.header').toggleClass('header-dark');
  $('.navbar').toggleClass('navbar-dark');

  if(localStorage.getItem('darkmode')==null){
  window.localStorage.setItem('darkmode','1');
  } else {
	 window.localStorage.removeItem('darkmode');
  }
  if(localStorage.getItem('darkmode')==null){
	$('#toggledarkicon').attr('src','photos/toggledark.png');
  } else {
	  $('#toggledarkicon').attr('src','photos/toggledark-dark.png');
  }
}
