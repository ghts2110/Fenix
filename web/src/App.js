import TelaLogin from "./components/TelaLogin";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import TelaDashboard from "./components/TelaDashboard";
import { CookiesProvider, useCookies } from "react-cookie";
import Register from "./components/TelaRegister";
import Client from "./components/TelaClient";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import TelaLogin from "./components/TelaLogin";
import TelaDashboard from "./components/TelaDashboard";
import ForgotPassword from "./components/ForgotPassword";

function App() {
  const [cookies, setCookie] = useCookies(["user"]);

  function handleLogin(user) {
    setCookie("user", user, { path: "/" });
  }

  return (
    <Router>
      {/* <CookiesProvider>
          <div>
            {cookies.user ? (
              <TelaLogin user={cookies.user} />
            ) : (
              <TelaDashboard onLogin={handleLogin} />
            )}
          </div>
        </CookiesProvider> */}

      <Routes>
        <Route path="/" element={<ForgotPassword />} />
        <Route path="/dashboard" element={<TelaDashboard />} />
        <Route path="/register" element={<Register />} />
        <Route path="/client" element={<Client />} />
      </Routes>
    </Router>
  );
}

export default App;
