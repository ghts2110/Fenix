import axios from 'axios';

export function generateOA() {
    let length = getRandomArbitrary(5, 9);

    let result = '';
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const charactersLength = characters.length;
    let counter = 0;
    while (counter < length) {
        result += characters.charAt(Math.floor(Math.random() * charactersLength));
        counter += 1;
    }
    return result;
};

function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
}

export const fetchUsers = async () => {
    try {
        const response = await axios.get('http://localhost:8080/api/users');
        console.log(response.data);
        return response.data;
    } catch (error) {
        console.error("Erro ao buscar dados", error);
        throw error;
    }
};