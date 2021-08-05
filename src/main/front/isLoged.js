token = localStorage.getItem('token');

if (!token) {
    url = window.location;
    const path = url.pathname.substring(0, url.pathname.lastIndexOf('/') + 1);
    location.href = path + "index.html";

}

const btnUsers = document.querySelector('#bntUsers');
btnUsers.addEventListener('click', () => {
    fetch('http://localhost:8080/users/', {
        method: 'GET',
        headers: {
            'Authorization': token,
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(json => {
            console.log(json);
        });
});