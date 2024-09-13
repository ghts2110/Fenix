import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import TelaLogin from "./components/TelaLogin";
import TelaDashboard from "./components/TelaDashboard";
import ForgotPassword from "./components/ForgotPassword";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<ForgotPassword />} />
        <Route path="/dashboard" element={<TelaDashboard />} />
        
      </Routes>
    </Router>

  );
}

export default App;
