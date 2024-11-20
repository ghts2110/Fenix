// src/components/UserList.js
import React, { useEffect, useState } from 'react';
import { fetchUsers } from '../Utils/UserService';

const UserList = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetchUsers()
            .then(setUsers)
            .catch((error) => console.error("Erro ao carregar usuários", error));
    }, []);

    return (
        <div>
            <h1>Lista de Usuários</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>{user.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default UserList;
