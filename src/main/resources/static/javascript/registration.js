const registerForm = document.getElementById('register-form')
const registerUsername = document.getElementById('get-userId')
const registerPassword = document.getElementById('get-lessonId')
const registerPassword = document.getElementById('register-registrationDate')

const headers = {
    'Content-Type':'application/json'
}
const baseUrl = 'http://localhost:8080/registration'

const handleSubmit = async (e) => {
    e.preventDefault()

    let bodyObj = {
        userId: getUserById.value,
        lessonId: getLessonById.value,
        registrationDate: registerRegistrationDate.value
    }

    const response = await fetch(`${baseUrl}/register`, {
        method: "Post",
        body: JSON.stringify(bodyObj),
        header: headers
    })
        .catch(err => console.error(err.message))

    const responseArr = await response.json()

    if(response.status === 200){
        window.location.replace(responseArr[0])
    }

    //registerForm.addEventListener("submit, handleSubmit"
}
registerForm.addEventListener("submit, handleSubmit")