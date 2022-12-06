import React from "react";
import styled from "styled-components";
import TodoList from "./TodoList";

// 메인 내용
class Todo extends React.Component {
    state = {
        todoList: []
      };
  render() {
    return (
      <Container>
        <Input placeholder="오늘 할 일" onKeyPress={this.handleInputKeyPress}></Input>
        <TodoList todoList={this.state.todoList} handleClickRemove={this.handleClickRemove}></TodoList>
      </Container>
    ); 
  }

  // 컴포넌트 렌더링 후 타는 함수
  componentDidMount() {
    this.setState({
      todoList: JSON.parse(localStorage.getItem("todoList")) || []
    });
  }

  // 엔터 입력 시 로컬 스토리지에 저장
  handleInputKeyPress = event => {
    const {
        target: { value }
      } = event;
      if (event.key === "Enter") {
        this.setState(
          state => ({ todoList: [...state.todoList, value] }),
          () =>
            localStorage.setItem("todoList", JSON.stringify(this.state.todoList))
        );
        event.target.value = "";
      }
  };

  // 목록 클릭 시 삭제 로직
  handleClickRemove = index => {
    if (window.confirm("목록에서 지우시겠습니까?")) {
      this.setState(
        state => ({
          todoList: [
            ...state.todoList.slice(0, index),
            ...state.todoList.slice(index + 1)
          ]
        }),
        () =>
          localStorage.setItem("todoList", JSON.stringify(this.state.todoList))
      );
    }
  };
}

const Container = styled.div`
  margin-top: 44px;
  text-align: center;
`;

const Input = styled.input`
  width: 80%;
  height: 33px;
  padding: 7px;
  outline: none;
  border: 1px solid silver;
  border-radius: 11px;
  background: transparent;
  font-size: 22px;
  color: white;
`;

export default Todo;