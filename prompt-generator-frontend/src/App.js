import React, { useState } from 'react';
import axios from 'axios';
import './App.css';
import logo from './assets/images/logo.png'; 

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
       <div className="App-header"> 
        <img src={logo} alt="Legendary Prompt Generator Logo" className="App-logo" />
      </div>
      <form onSubmit={handleSubmit}>
        <label>
          Subject:
          <input 
            type="text" 
            value={subject} 
            onChange={(e) => setSubject(e.target.value)}
          />
        </label>
       <button className="custom-btn">Generate Prompt</button>


      </form>
      {prompt && <p>{prompt}</p>}
    </div>
  );
}

export default App;
