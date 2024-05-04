let userlogged = localStorage.getItem("user");
if (userlogged != null) {
    changeControls();
}

function changeControls() {
    let btnContainer = document.querySelector(".quote_btn-container");
    btnContainer.innerHTML = `
        <a href="profile.html">
            <i class="fa fa-user" aria-hidden="true"></i>
            <span>
            Личный кабинет
            </span>
        </a>`
}