import { render, screen, fireEvent } from '@testing-library/react';
import TelaCliente from '../../components/TelaCliente';

beforeEach(() => {
	const { } = render(
		<TelaCliente />
	);
});

afterEach(cleanup);

test('logon page page 1', () => {
    fireEvent.change(screen.getByPlaceholderText('fullName'), { target: { value: "Flavio Joao Benedito da Silva" } });
    fireEvent.change(screen.getByPlaceholderText('socialName'), { target: { value: "Flavinha Joanita Benedita da Silvo" } });
    fireEvent.change(screen.getByPlaceholderText('gender'), { target: { value: "masculino" } });
    fireEvent.change(screen.getByPlaceholderText('sexualOrientation'), { target: { value: "bissexual" } });
    fireEvent.change(screen.getByPlaceholderText('ehnicity'), { target: { value: "indigena" } });
    fireEvent.change(screen.getByPlaceholderText('birthDate'), { target: { value: "16/02/1998" } });
    fireEvent.change(screen.getByPlaceholderText('nacionality'), { target: { value: "Brasil" } });
    fireEvent.change(screen.getByPlaceholderText('stateOfBirth'), { target: { value: "Acre" } });
    fireEvent.change(screen.getByPlaceholderText('cityOfBirth'), { target: { value: "Rio Branco" } });
    fireEvent.change(screen.getByPlaceholderText('fatherName'), { target: { value: "Pai de acucar" } });
    fireEvent.change(screen.getByPlaceholderText('motherName'), { target: { value: "Mae de leite" } });

    fireEvent.click(screen.getByRole('submit', { name: /btRecoverPassword/i }));
});

test('logon page page 2', () => {
    fireEvent.change(screen.getByPlaceholderText('cpf'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('rg'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('electoralTitle'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('votingSection'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('votingZone'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('cnh'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('civilState'), { target: { value: "" } });
    fireEvent.change(screen.getByPlaceholderText('fullName'), { target: { value: "" } });

});

test('logon page page 3', () => {

});

test('logon page page 4', () => {

});

test('logon page page 5', () => {

});

test('logon page page 6', () => {

});

test('logon page page 7', () => {

});