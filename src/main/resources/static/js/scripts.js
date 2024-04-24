/*!
* Start Bootstrap - Shop Homepage v5.0.6 (https://startbootstrap.com/template/shop-homepage)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-shop-homepage/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

document.addEventListener("DOMContentLoaded", function() {
    const cartButton = document.querySelector('.btn-outline-dark');
    const cartPreview = document.getElementById('cartPreview');

    cartButton.addEventListener('click', function(event) {
        event.preventDefault();
        
        // Aquí deberías mostrar la vista previa del carrito
        cartPreview.innerHTML = '<h3>¡Vista previa del carrito!</h3>'; // Aquí puedes personalizar la vista previa como quieras
        cartPreview.style.display = 'block'; // Mostrar la vista previa
    });

    // Evento para cerrar la vista previa al hacer clic en cualquier lugar fuera de la vista previa
    document.addEventListener('click', function(event) {
        if (event.target !== cartButton && !cartPreview.contains(event.target)) {
            cartPreview.style.display = 'none'; // Ocultar la vista previa
        }
    });
});