// const login = require('../components/**/*.js');

import { render, screen, fireEvent } from '@testing-library/react';
import FormsLogin from '../../components/TelaLogin/Forms';

beforeEach(() => {
	const { } = render(
		<FormsLogin />
	);
});

afterEach(cleanup);

// Space input

test('email is space', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(1) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(4) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('password is space', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(1) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('both email and password are space', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(1) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(1) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

// Null input

test('email is null', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(2) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(4) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('password is null', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(2) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('both email and password are null', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(2) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(2) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

// Wrong input

test('email is wrong', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(3) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(4) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('password is wrong', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(3) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('both email and password are wrong', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(3) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(3) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

// Correct input

test('both email and password are correct', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(4) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

// Password

test('password is too short', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(5) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

test('password is too long', () => {
	fireEvent.change(screen.getByPlaceholderText('email'), { target: { value: email_inputs(4) } });
	fireEvent.change(screen.getByPlaceholderText('password'), { target: { value: passwords_inputs(6) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btlogin/i }));
});

function email_inputs(opt) {
	switch (opt) {
		case 1:
			return " ";
		case 2:
			return "";
		case 3:
			return "email@email.com";
		case 4:
			return "test@email.com";
	}
}

function passwords_inputs(opt) {
	switch (opt) {
		case 1:
			return " ";
		case 2:
			return "";
		case 3:
			return "12345678";
		case 4:
			return "senha123";
		case 5:
			return "123"
		case 6:
			return "123456789123456789123"
	}
}

