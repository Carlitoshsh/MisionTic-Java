var elementoHTML = document.getElementById("perros");

fetch("http://localhost:8080/perros").then(function (response) {
    return response.json();
}).then(function (data) {
    var htmlBurned = "";
    data.forEach(element => {
        htmlBurned += `
        <div class="card">
            <img src="${element.imagen}" class="" alt="${element.nombre}">
            <h4 class="card-title">${element.nombre}</h4>
            <p class="card-text">${element.edad} años</p>
            <p class="card-text">${element.raza}</p>
        </div>
        `
    });
    elementoHTML.innerHTML = htmlBurned;
}).catch(function (error) {
    console.log(error);
}).finally(function () {
    console.log("Finalizado");
})