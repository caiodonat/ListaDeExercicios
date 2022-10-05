/**
 * 2 Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 *
 * @author CaioDonat
 */

const buttonA = document.querySelector('#button_A');
const headingA = document.querySelector('#heading_A');

buttonA.onclick = () => {
  const name = prompt('What is your name?');
  alert(`Hello ${name}, nice to see you!`);
  headingA.textContent = `Welcome ${name}`;
};
