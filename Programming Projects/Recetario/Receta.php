<?php 
include("includes/header.php");
include("includes/bd.php");
?>

<?php

if (isset($_GET['id'])){
    $id = $_GET['id'];

    $result = $database->select("receta", "*", ["id" => $id]);

    if (count($result) == 1) {
        $nombre_receta = $result[0]['nombre_receta'];
        $t_preparacion = $result[0]['t_preparacion'];
        $t_coccion = $result[0]['t_coccion'];
        $porciones = $result[0]['porciones'];
        $complejidad = $result[0]['complejidad'];
        $categoria = $result[0]['categoria'];
        $ocasion = $result[0]['ocasion'];
        $descripcion = $result[0]['descripcion'];
        $lista_ingredientes = $result[0]['lista_ingredientes'];
        $i_preparacion = $result[0]['i_preparacion'];
        $img = $result[0]['img'];
    }
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Receta</title>


  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@100;200;400&display=swap" rel="stylesheet">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="./css/Style.css">
</head>

<body>

  <?php 
  $result = $database->select("receta", "*");
      
  ?>
  <!--TITULO-->
  <section class="container-fluid text-center">
    <h1 class="title-receta mt-5 mb-2"><?php echo $nombre_receta ?></h1>
    <img class="img-fluid" src="img/red line.png" alt="linea">
  </section>

  <section class="container-fluidtext">
    <a class="big-text-like pe-lg-5" href="#"><img class="img-fluid heart" src="img/corazon R.png" alt=""> 225</a>
  </section>

  <section class="container-fluid text-center">
    <img class="img-fluid" src="<?php echo $img ?>"  alt="Arroz con leche">
  </section>

  <!--Tabla-->
  <section class="container-fluid ">
    <table class="table mt-5 text-center">
      
      <tbody>
        <tr>
          <td class="text-center text">Dificultad: <?php echo $complejidad ?></td>
          <td class="text-center text">Tiempo total: <?php echo $t_preparacion ?></td>
          <td class="text-center text">Porciones: <?php echo $porciones ?></td>
        </tr>
        <tr>
          <td class="text-center text">Categoria: <?php echo $categoria ?></td>
          <td class="text-center text">Tiempo cocción: <?php echo $t_coccion ?></td>
          <td class="text-center text">Ocasión: <?php echo $ocasion ?></td>
        </tr>

      </tbody>
    </table>

    <!--Cuadro-->
    <table class="table">

      <tbody>
        <tr>
          <td class="text">
            <h1 class="red-sub-title ms-5 mt-2">Descripción</h1>
            <p class="me-5 ms-5"><?php echo $descripcion ?></p>
            <br>
            <h1 class="red-sub-title ms-5">Ingredientes</h1>
            <div class="col-md">
              <div class="row">
              <?php
                $keywords = preg_split("/[0-9]\./", $lista_ingredientes);
                foreach ($keywords as &$value) { ?>
                  <p class="ms-lg-5 me-lg-5 text pe-lg-5 ps-lg-5">  <?php echo $value ?> </p>
              <?php
                    echo "</br>";
                }
              ?>
              </div>
          </td>
        </tr>
      </tbody>
    </table>
  </section>

  <!--Instrucciones-->
  <section class="container-fluid">
    <h1 class="red-sub-title text-center pt-3">Instrucciones</h1>
  
    <?php
      $keywords = preg_split("/[0-9]\./", $i_preparacion);
      foreach ($keywords as &$value) { ?>
         <p class="ms-lg-5 me-lg-5 text pe-lg-5 ps-lg-5">  <?php echo $value ?> </p>
    <?php
          echo "</br>";
      }
    ?>

  </section>

  <!--Recomendaciones-->
  <section class="container-fluid">
    <h1 class="red-sub-title text-center pt-5">Recomendados</h1>

    <div class="row">
      <div class="col">
        <div class="card  ms-lg-5  mb-5" style="width:23rem;">
          <h1 class="xs-sub-title">Panqueques</h1>
          <a href="receta.php"><img class="card-img-top" src="img/pan.png" alt="panqueques"></a>
          <div class="card-body red-space">
            <p class="card-text xs-sub-title-white text-center">Detalles</p>
            <p class="card-text xs-sub-title-white text-center">
              Dificultad: Fácil <br>
              Duración: 45 min <br>
              Categoría: Desayuno <br>
              Ocasión: Verano <br>
            </p>
            <img class="img-fluid line" src="img/linea.png" alt="division">
            <ul>
              <a class="small-text" href="#">Agregar</a>
              <a class="small-text-like" href="#"><img class="img-fluid heart" src="img/corazon.png" alt=""> 225</a>
            </ul>

          </div>
        </div>
      </div>
      <div class="col">
        <div class="card  ms-4  mb-5" style="width:23rem;">
          <h1 class="xs-sub-title">Sopa azteca</h1>
          <a href="receta.php"><img class="card-img-top" src="img/azteca.png" alt="sopa azteca"></a>
          <div class="card-body red-space">
            <p class="card-text xs-sub-title-white text-center">Detalles</p>
            <p class="card-text xs-sub-title-white text-center">
              Dificultad: Intermedio <br>
              Duración: 2 horas <br>
              Categoría: Sopa <br>
              Ocasión: Todas <br>
            </p>
            <img class="img-fluid line" src="img/linea.png" alt="division">
            <ul>
              <a class="small-text" href="#">Agregar</a>
              <a class="small-text-like" href="#"><img class="img-fluid heart" src="img/corazon.png" alt=""> 225</a>
            </ul>

          </div>
        </div>
      </div>
      <div class="col">
        <div class="card  ms-lg-2  mb-5" style="width:23rem;">
          <h1 class="xs-sub-title">Malteada</h1>
          <a href="receta.php"><img class="card-img-top" src="img/Ba.png" alt="batido"></a>
          <div class="card-body red-space">
            <p class="card-text xs-sub-title-white text-center">Detalles</p>
            <p class="card-text xs-sub-title-white text-center">
              Dificultad: Fácil <br>
              Duración: 15 min <br>
              Categoría: Bebida <br>
              Ocasión: Semana Santa <br>
            </p>
            <img class="img-fluid line" src="img/linea.png" alt="division">
            <ul>
              <a class="small-text" href="#">Agregar</a>
              <a class="small-text-like" href="#"><img class="img-fluid heart" src="img/corazon.png" alt=""> 225</a>
            </ul>

          </div>
        </div>
      </div>
    </div>
  </section>

  <?php 
  include("includes/footer.php");
  ?>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>

</body>

</html>