import React from "react";
import styled from "styled-components";

class TodoRow extends React.Component {
  // props 또는 state가 새로운 값으로 갱신되어서 렌더링이 발생하기 직전에 호출
  // 기본값은 true, false 리턴 시 렌더링 X
  shouldComponentUpdate(nextProps, nextState) {
    if (this.props.todo === nextProps.todo) {
      return false;
    }
    return true;
  }
  render() {
    const { index, todo, handleClickRemove } = this.props;
    return (
      <Container>
        <Text onClick={() => handleClickRemove(index)}>{todo}</Text>
      </Container>
    );
  }
}

const Container = styled.div`
  margin: 13px 0;
  width: 80%;
  text-align: left;
`;

const Text = styled.div`
  display: inline-block;
  cursor: pointer;
  font-size: 32px;
  &:hover {
    opacity: 0.4;
  }
`;

export default TodoRow;