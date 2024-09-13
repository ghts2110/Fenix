import TelaLogin from "./components/TelaLogin";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import TelaDashboard from "./components/TelaDashboard";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<TelaLogin />} />
        <Route path="/dashboard" element={<TelaDashboard />} />
      </Routes>
    </Router>

  );
}

export default App;
