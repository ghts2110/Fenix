import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import TelaDashboard from "./components/TelaDashboard";
import Register from "./components/TelaRegister";
import Assisted from "./components/TelaAssisted";
import Client from "./components/TelaClient";
import TelaLogin from "./components/TelaLogin";
import ForgotPassword from "./components/ForgotPassword";
import ResetPassword from './components/ResetPassword';
import TelaCalculadoraJuridica from "./components/TelaCalculadoraJuridica/CalculadoraJuridica";

function App() {
  // const [cookies, setCookie] = useCookies(["user"]);

  // function handleLogin(user) {
  //   setCookie("user", user, { path: "/" });
  // }


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
        <Route path="/" element={<TelaLogin />} />
        <Route path="/dashboard" element={<TelaDashboard />} />
        <Route path="/register" element={<Register />} />
        <Route path="/assisted" element={<Assisted />} />
        <Route path="/client" element={<Client />} />
        <Route path="/forgotpassword" element={<ForgotPassword />} />
        <Route path="/resetpassword" element={<ResetPassword />} />
        <Route path="/cancelrequest/:id/" element={<ResetPassword />} />
        <Route path="/calculadorajuridica" element={<TelaCalculadoraJuridica />} />

      </Routes>
    </Router>
  );
}

export default App;
