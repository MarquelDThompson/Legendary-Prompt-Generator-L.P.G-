import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [subject, setSubject] = useState('');
  const [prompt, setPrompt] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.get(`http://localhost:8080/api/generate-prompt?mainSubject=${subject}`);
      setPrompt(response.data);
    } catch (error) {
      console.error("There was an error fetching the prompt!", error);
    }
  };

  return (
    <div className="App">
      <form onSubmit={handleSubmit}>
        <label>
          Subject:
          <input 
            type="text" 
            value={subject} 
            onChange={(e) => setSubject(e.target.value)}
          />
        </label>
        <button type="submit">Generate Prompt</button>
      </form>
      {prompt && <p>{prompt}</p>}
    </div>
  );
}

export default App;
