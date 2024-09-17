import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import TelaLogin from "./components/TelaLogin";
import TelaDashboard from "./components/TelaDashboard";
import ForgotPassword from "./components/ForgotPassword";
import ResetPassword from './components/ResetPassword';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<TelaLogin />} />
        <Route path="/dashboard" element={<TelaDashboard />} />
        <Route path="/forgotpassword" element={<ForgotPassword />} />
        <Route path="/resetpassword" element={<ResetPassword />} />
        <Route path="/cancelrequest/:id/" element={<ResetPassword />} />
      </Routes>
    </Router>

  );
}

export default App;
