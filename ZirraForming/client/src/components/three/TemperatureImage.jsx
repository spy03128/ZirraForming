import { Html } from "@react-three/drei";
import styled from "styled-components";

const Wrapper = styled.div`
  position: relative;
  right: 50%;
  width: min(50vw, 600px);
  height: min(calc(50vw * 0.7), calc(600px * 0.7));
  background-color: red;
`;

function TemperatureImage() {
  return (
    <Html center>
      <Wrapper></Wrapper>
    </Html>
  );
}

export default TemperatureImage;
