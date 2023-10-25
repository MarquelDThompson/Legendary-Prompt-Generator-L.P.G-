import React, { useState, useRef } from 'react';
import axios from 'axios';
import './App.css';
import logo from './assets/images/logo.png'; 
import background from './assets/images/background2.png';

function App() {
  const [subject, setSubject] = useState('');
  const [prompt, setPrompt] = useState('');
  const promptRef = useRef(null);

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.get(`http://localhost:8080/api/generate-prompt?mainSubject=${subject}`);
      setPrompt(response.data);
    } catch (error) {
      console.error("There was an error fetching the prompt!", error);
    }
  };

  const handleCopy = () => {
    promptRef.current.select();
    document.execCommand('copy');
  };

  return (
    <div className="App">
      <div className="App-header" style={{ backgroundImage: `url(${background})` }}>
        <img src={logo} alt="Legendary Prompt Generator Logo" className="App-logo" />
        <form className="form-container" onSubmit={handleSubmit}>
          <label>
            Subject:
            <input 
              type="text" 
              value={subject}
              className="subject-input"
              onChange={(e) => setSubject(e.target.value)}
            />
          </label>
          <button className="custom-btn generate-btn">Generate Prompt</button>
        </form>
        {prompt && (
          <>
            <textarea 
              ref={promptRef}
              value={prompt} 
              readOnly 
              className="prompt-output"
              rows="3"
            ></textarea>
            <button onClick={handleCopy} className="custom-btn copy-btn">Copy to Clipboard</button>
          </>
        )}
      </div>
    </div>
);
}

export default App;

