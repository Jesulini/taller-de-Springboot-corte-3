document.addEventListener('DOMContentLoaded', () => {
  const modal = new bootstrap.Modal(document.getElementById('detalleModal'));
  const catalogoCards = document.getElementById('catalogoCards');

  catalogoCards.addEventListener('click', e => {
    if (e.target.matches('button[data-titulo]')) {
      const titulo = e.target.getAttribute('data-titulo');
      const descripcion = e.target.getAttribute('data-descripcion');
      const imagen = e.target.getAttribute('data-imagen');

      document.getElementById('detalleModalLabel').textContent = titulo;
      document.getElementById('modalImagen').src = imagen;
      document.getElementById('modalImagen').alt = titulo;
      document.getElementById('modalDescripcion').textContent = descripcion;

      modal.show();
    }
  });
});
