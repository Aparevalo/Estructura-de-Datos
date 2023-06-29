const fileInput = document.getElementById('file-input');
const image = document.getElementById('image');
const description = document.getElementById('prediction');
const acceptedImageTypes = ['image/gif', 'image/jpeg', 'image/png'];
const inputError = document.getElementById('input-error');

let model;

console.log('Anderson Arevalo');


function displayDescription(predictions) {

	console.log(predictions.sort((a, b) => a > b));
  const result = predictions.sort((a, b) => a > b)[0];

  if (result.probability > 0.2) {
    const probability = Math.round(result.probability * 100);


    description.innerText = `${probability}% De probabilidad que es ${result.className.replace(',', ' o')}`;
  } else description.innerText = 'No estoy seguro de lo que es';
}


function classifyImage() {
  model.classify(image).then((predictions) => {
    displayDescription(predictions);
  });
}


function getImage() {

  if (!fileInput.files[0]) throw new Error('Imagen no econtrada');
  const file = fileInput.files[0];

  
  if (!acceptedImageTypes.includes(file.type)) {
    inputError.classList.add('show');
    throw Error('El elemento subido no es una imagen');
  } else inputError.classList.remove('show');

  
  const reader = new FileReader();

  
  reader.onload = function (event) {
   
    const dataUrl = event.target.result;

   
    const imageElement = new Image();
    imageElement.src = dataUrl;

   
    imageElement.onload = function () {
   
      image.setAttribute('src', this.src);
      image.setAttribute('height', this.height);
      image.setAttribute('width', this.width);

   
      classifyImage();
    };

   
    document.body.classList.add('image-loaded');
  };

  
  reader.readAsDataURL(file);
}


mobilenet.load().then((m) => {

  model = m;


  document.body.classList.remove('loading');


  fileInput.addEventListener('change', getImage);
});