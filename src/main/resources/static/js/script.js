document.addEventListener("DOMContentLoaded", function() {
    const btnTopo = document.getElementById('btn-topo');

    // Mostrar ou esconder botão ao rolar a página
    window.addEventListener('scroll', function() {
        if (window.scrollY > 200) {
            btnTopo.style.display = "block";
        } else {
            btnTopo.style.display = "none";
        }
    });

    // Scroll suave ao topo
    btnTopo.addEventListener('click', function() {
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });
});
