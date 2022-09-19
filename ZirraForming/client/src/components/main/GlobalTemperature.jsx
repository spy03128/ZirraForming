import { Html } from "@react-three/drei";
import styled from "styled-components";

const Wrapper = styled.div`
  position: absolute;
  top: 200vh;
  left: 40vw;

  display: flex;
  flex-direction: column;
  padding: 20px;
  width: 60vw;

  .title {
    font-size: 2.5rem;
    align-self: center;
    margin-bottom: 100px;
  }

  .content {
    margin-bottom: 100px;
  }
  .graph {
    width: 300px;
    height: 300px;
    background-color: red;
    align-self: center;
  }
`;

function GlobalTemperature() {
  return (
    <Wrapper>
      <div className="title">매년 상승하는 지구기온</div>
      <div className="content">
        재의 지구온난화 수준에서도 그린란드 빙상 붕괴, 영구동토층 해빙, 열대
        산호초 소멸 등 5가지 위험이 티핑 포인트(전환점)를 지났을 수 있다는 연구
        결과가 나왔다. 국제연구팀은 산업화 이전에 견줘 지구 평균 기온 상승폭을
        1.5도 이내로 제한하자는 파리기후협정의 목표를 이루더라도 기후위기에 따른
        여러 위험이 촉발될 수 있다는 분석을 내놓았다.
      </div>
      <div className="graph"></div>
    </Wrapper>
  );
}

export default GlobalTemperature;
