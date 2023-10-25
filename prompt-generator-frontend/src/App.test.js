import React from 'react';
import { render, fireEvent, waitFor, screen } from '@testing-library/react';
import axios from 'axios';
import App from './App';

// Mocking the axios module to avoid making real API calls during testing.
jest.mock('axios');

describe('<App />', () => {
  
  test('renders the App component', () => {
    render(<App />);
    
    // Check if the logo, input field, and button are rendered.
    expect(screen.getByAltText("Legendary Prompt Generator Logo")).toBeInTheDocument();
    expect(screen.getByLabelText(/subject/i)).toBeInTheDocument();
    expect(screen.getByRole('button', { name: /generate prompt/i })).toBeInTheDocument();
  });
  
  test('allows input to change', () => {
    render(<App />);
    const input = screen.getByLabelText(/subject/i);
    
    fireEvent.change(input, { target: { value: 'Dragon' } });
    
    expect(input.value).toBe('Dragon');
  });

  test('handles "Generate Prompt" button click with API call', async () => {
    const mockData = "Your art prompt is...";
    axios.get.mockResolvedValue({ data: mockData });
    
    render(<App />);
    const input = screen.getByLabelText(/subject/i);
    fireEvent.change(input, { target: { value: 'Dragon' } });
    
    fireEvent.click(screen.getByRole('button', { name: /generate prompt/i }));
    
    // Wait for the mock API call to complete and check if the prompt is displayed.
    await waitFor(() => expect(screen.getByText(mockData)).toBeInTheDocument());
  });

 

});


