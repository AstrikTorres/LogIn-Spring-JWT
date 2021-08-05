const formLogin = document.querySelector("#formLogin");

formLogin.addEventListener("submit", (e) => {

    e.preventDefault();
    const email = document.querySelector("#email");
    const password = document.querySelector("#password");

    const emailError = document.querySelector("#emailError");
    const passwordError = document.querySelector("#passwordError");

    if(email.value == '') {
        emailError.textContent = "Error, favor de ingresar un email";
    }

    if(password.value == '') {
        passwordError.textContent = "Error, favor de ingresar un password";
    }

    if (email.value != '' && password.value != '') {
    
        fetch('http://localhost:8080/login', {
            method: "POST",
            body: JSON.stringify({
                username: email.value,
                password: password.value
            }),
            headers: {
                "Content-Type": "application/json"
            }
        }).then(resp => {
            token = resp.headers.get("Authorization");

            if (token && token.includes('Bearer')) {
                console.log(token);
                localStorage.setItem("token", token);
                /* window.location.href = "succes.html"; */
                url = window.location;
                const path = url.pathname.substring(0, url.pathname.lastIndexOf('/') + 1);

                location.href = path + "succes.html";
            } else {
                localStorage.removeItem("token");            
                alert("Error, favor de ingresar un email y un password validos");
            }
            
        })
    }
})
