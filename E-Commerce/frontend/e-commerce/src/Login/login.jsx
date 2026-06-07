import { useState } from "react";
import InputField from "../common/InputField";
import Button from "../common/Button";

const Login = ({ switchToSignup }) => {
  const [form, setForm] = useState({
    email: "",
    password: "",
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.type]: e.target.value });
  };

  const handleSubmit = () => {
    console.log("Login Data:", form);
  };

  return (
    <div className="glass p-8 w-[350px] text-center text-white">
      <h2 className="text-2xl font-bold mb-6">Login</h2>

      <div className="space-y-4">
        <input
          type="email"
          placeholder="Email"
          onChange={handleChange}
          className="w-full p-3 rounded-lg bg-white/20 text-white"
        />
        <input
          type="password"
          placeholder="Password"
          onChange={handleChange}
          className="w-full p-3 rounded-lg bg-white/20 text-white"
        />

        <button onClick={handleSubmit} className="w-full bg-purple-500 py-3 rounded-lg">
          Login
        </button>
      </div>

      <p className="mt-4 text-sm">
        Don't have an account?{" "}
        <span
          onClick={switchToSignup}
          className="text-purple-300 cursor-pointer"
        >
          Sign up
        </span>
      </p>
    </div>
  );
};

export default Login;