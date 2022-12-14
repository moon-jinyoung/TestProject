import React from "react";
import styled from "styled-components";
import Content from "./Content";

class App extends React.Component {
  render() {
    return (
    <Container>
      <Content />
    </Container>
    );
  }
}

// 메인 백그라운드
// url: 이미지 랜덤 주소
const Container = styled.div`
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(
      to right,
      rgba(20, 20, 20, 0.1) 10%,
      rgba(20, 20, 20, 0.7) 70%,
      rgba(20, 20, 20, 1)
    ),
    url(https://source.unsplash.com/random/1920x1080);
  background-size: cover;
  `;

export default App;