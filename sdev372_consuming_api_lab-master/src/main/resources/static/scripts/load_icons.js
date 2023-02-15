// run this function on page load
window.onload = loadIcons;

function loadIcons(){
    let uri = "http://localhost:8080/api/v1/icons";
    let params = {
      method: "get",
        mode: "cors"
    };

    // method chaining
    fetch(uri, params)
        .then(function (response) {
            console.log(response);
            return response.json();
        })
        .then(function (json){
        console.log(json);
        showIcons(json);
        });
}

function showIcons(icons){
    // get our list
    let list = document.getElementById("icons");

    // loop over all icons
    for(let i = 0; i < icons.length; i++){
        // add each icon to list
        let icon = icons[i];
        let id = icon.id;

        // create element using funtion on document
        let li = document.createElement("li");
        li.innerHTML = id;

        loadIcons();

        // add spans
        let iconSpan = document.createElement("span");

        iconSpan.innerHTML = icons.image;

        li.appendChild(iconSpan);

        // attach the li to the dom
        list.appendChild(li);
    }
}

