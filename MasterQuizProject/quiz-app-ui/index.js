function startQuiz(quizType) {
    alert(`Starting ${quizType.charAt(0).toUpperCase() + quizType.slice(1)} Quiz!`);
    
    // Redirecting to the corresponding quiz page based on the selected type
    // window.location.href = `${quizType}.html`;
    window.location.href = `${quizType}-quiz.html`;
     // that is depend on which button you are clicking Assumes pages are named quiz-java.html, quiz-python.html, etc.
}

