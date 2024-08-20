import { realizarTarea } from 'C:\Users\ASUS\Desktop\Prueba tecnica Scotiabank\Prueba tecnica Scotiabank\Reto 2\src\main\script.js';

describe('Simulación de tarea asíncrona', () => {
    //Simulacion de una tarea exitosa generando el mensaje completo de su proceso 
    test('Debe completar la tarea con éxito', async () => {
        const result = await realizarTarea();
        expect(result).toBe("éxito");
    });

    //Simulacion de una tarea fallida generando el mensaje completo de su proceso 
    test('Debe manejar un fallo en la tarea', async () => {
        const mockError = jest.spyOn(global, 'setTimeout').mockImplementation((callback) => {
            callback(); 
        });

        await expect(realizarTarea()).rejects.toThrow("Fallo en la tarea");

        mockError.mockRestore();
    });
});
