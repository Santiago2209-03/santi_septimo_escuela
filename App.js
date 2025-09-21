import { StyleSheet, Text, View, TextInput, Button } from 'react-native';
import React, { useState } from 'react';

export default function App() {
  const [usuario, setUsuario] = useState('');
  const [password, setPassword] = useState('');
  const [mensaje, setMensaje] = useState('');
  const [color, setColor] = useState('black');

  const login = () => {
    const USER = "admin";
    const PASS = "1234";

    if (usuario === USER && password === PASS) {
      setMensaje(`Acceso ${usuario}`);
      setColor("green");
    } else {
      setMensaje("Usuario o contraseña incorrectos");
      setColor("red");
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.titulo}>Login</Text>

      <TextInput
        style={styles.input}
        placeholder="Usuario"
        value={usuario}
        onChangeText={setUsuario}
      />

      <TextInput
        style={styles.input}
        placeholder="Contraseña"
        secureTextEntry={true}
        value={password}
        onChangeText={setPassword}
      />

      <Button title="Entrar" onPress={login} />

      
      {mensaje !== '' && (
        <Text style={{ color: color, marginTop: 15, fontWeight: "bold" }}>
          {mensaje}
        </Text>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 20,
  },
  titulo: {
    fontSize: 20,
    marginBottom: 15,
  },
  input: {
    width: '100%',
    height: 40,
    backgroundColor: '#eee',
    marginBottom: 10,
    paddingHorizontal: 10,
    borderRadius: 5,
  },
});
