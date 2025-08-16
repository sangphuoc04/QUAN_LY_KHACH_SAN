document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('loginForm');
    if (form) {
        form.addEventListener('submit', function () {
            console.log('Form submitted');
        });
    }
});