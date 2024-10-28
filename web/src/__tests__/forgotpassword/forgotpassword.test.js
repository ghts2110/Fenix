// const login = require('../components/**/*.js');

import { render, screen, fireEvent } from '@testing-library/react';
import ForgotPassword from '../../components/ForgotPassword';

beforeEach(() => {
	const { } = render(
		<ForgotPassword />
	);
});

afterEach(cleanup);

test('email is space', () => {
    fireEvent.change(screen.getByPlaceholderText('email_to'), { target: { value: email_inputs(1) } });

    fireEvent.click(screen.getByRole('submit', { name: /btRecoverPassword/i }));
});

test('missing email', () => {
    fireEvent.change(screen.getByPlaceholderText('email_to'), { target: { value: email_inputs(2) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btRecoverPassword/i }));
});

test('not exist email', () => {
    fireEvent.change(screen.getByPlaceholderText('email_to'), { target: { value: email_inputs(3) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btRecoverPassword/i }));
});

test('right email', () => {
    fireEvent.change(screen.getByPlaceholderText('email_to'), { target: { value: email_inputs(4) } });
	
	fireEvent.click(screen.getByRole('submit', { name: /btRecoverPassword/i }));
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
