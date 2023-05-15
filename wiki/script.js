// Obtener referencias a los elementos del DOM
const searchInput = document.getElementById('search-input');
const searchButton = document.getElementById('search-button');
const contentSections = document.querySelectorAll('.content');

// Función de búsqueda
function search() {
  const searchTerm = searchInput.value.toLowerCase();

  contentSections.forEach(section => {
    const title = section.querySelector('h2').textContent.toLowerCase();
    const content = section.textContent.toLowerCase();

    // Ocultar o mostrar las secciones según el término de búsqueda
    if (title.includes(searchTerm) || content.includes(searchTerm)) {
      section.style.display = 'block';
    } else {
      section.style.display = 'none';
    }
  });
}

// Manejar el evento de búsqueda al hacer clic en el botón
searchButton.addEventListener('click', search);
