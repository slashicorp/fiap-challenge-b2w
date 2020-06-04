const target = document.querySelectorAll('[data-anime]');
const animationClass = 'anime';

function animeScroll(){
  const windowsTop = window.pageYOffset;
  target.forEach(function(element){
    console.log(element.offsetTop);
  })
}

window.addEventListener('scroll', function (){
  animeScroll();
})
