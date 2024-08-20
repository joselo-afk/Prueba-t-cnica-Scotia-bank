document.getElementById('startButton').addEventListener('click', async () => {
    const messageDiv = document.getElementById('message');
    messageDiv.textContent = "La tarea se está ejecutando en segundo plano...";

    // Simulación de una tarea asíncrona
    try {
        const result = await realizarTarea();
        messageDiv.textContent = `La tarea ha sido completada. Resultado: ${result}`;
    } catch (error) {
        messageDiv.textContent = `Error en la tarea: ${error.message}`;
    }
});

// Función asíncrona que simula la llamada a un backend
async function realizarTarea() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true; // Simulación de éxito o fallo
            if (success) {
                resolve("éxito");
            } else {
                reject(new Error("Fallo en la tarea"));
            }
        }, 3000); // Simula un retraso de 3 segundos
    });
}