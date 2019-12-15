interface PropsType {
  condition: boolean
  children: any
}

const If = (props: PropsType) => {
  if (props.condition) {
    return props.children
  } else {
    return null
  }
}

export default If
