<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Indentificador</title>
    
    <link rel="stylesheet" href="app.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    
    <script src="https://cdn.jsdelivr.net/npm/@tensorflow/tfjs@1.0.1"> </script>
    <script src="https://cdn.jsdelivr.net/npm/@tensorflow-models/mobilenet@1.0.0"> </script>

    
    
</head>
<body class="loading">
    <main>

        <h1>Indentificador de Objetos</h1>
        <h3 class="credits">
            <a href="#">Anderson Arevalo</a>
        </h3>

        <div class="loader">
            <h2>Cargando ...</h2>
        </div>

        <section class="image-section">
            <img src="" id="image" />
			<img src="upñpads/img_converted.png"/>
            <div class="image-prediction" id="prediction"></div>
        </section>

        <section class="file-section">
            <div class="file-group">
                <label for="file-input" accept="image/x-png,image/gif,image/jpeg">Sube una imagen</label>
                <input type="file" id="file-input" name="submit"/>
                <div class="error" id="input-error">Un error ocurrio, asegurate de subir solo una imagen</div>
            </div>
        </section>
    </main>

    <script src="app.js"></script>

</body>
</html>